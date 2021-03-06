package minischeme.web.controller;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import minischeme.Evaluator;
import minischeme.GlobalEnvironment;
import minischeme.parser.api.Parser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
@lombok.extern.slf4j.Slf4j
public class EvaluatorController {

  @GetMapping
  public String show(final Model model) {
    if (! model.containsAttribute("command")) {
      model.addAttribute("command", new RunCommand());
    }
    return "show";
  }

  @PostMapping
  public String run(
        @Valid final RunCommand command
      , final BindingResult bindingResult
      , final RedirectAttributes redirectAttributes
    ) {

    if (bindingResult.hasErrors()) {
      redirectAttributes
        .addFlashAttribute("flash_error", "run_invalid_command_flash_error_message")
        .addFlashAttribute("command", command)
        ;
      return "redirect:/";
    }

    try {
      final var source = command.getSource();
      log.info("CODE SOURCE RECU: <{}>", source);

      /*On prend le code source minischeme de la variable "source"
        On calcule le resultat à l'aide de l'evaluateur et on affiche
        le resultat dans l'interface graphique
      */
      var code = (List<Object>) Parser.parseString(source);
      Object result = new Evaluator().eval(code, GlobalEnvironment.build());
      command.setResult(result.toString());

      redirectAttributes
        .addFlashAttribute("flash_success", "run_evaluation_flash_success_message")
        .addFlashAttribute("command", command)
        ;
    } catch (Exception e) {
      redirectAttributes
        .addFlashAttribute("flash_error", "run_evaluation_flash_error_message")
        .addFlashAttribute("command", command)
        ;
    }

    return "redirect:/";
  }
}

@lombok.Data
@lombok.NoArgsConstructor
class RunCommand implements Serializable {

  @NotBlank
  @NotNull
  private String source = "";
  
  @NotNull
  private String result = "";
}
