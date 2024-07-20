package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalDialogPage {


    public static final Target OPEN_MODAL_BUTTON = Target.the("Open Modal Button")
            .located(By.id("openModalButtonId")); // Reemplaza con el ID correcto


    public static final Target CLOSE_MODAL_BUTTON = Target.the("Close Modal Button")
            .located(By.id("closeModalButtonId")); // Reemplaza con el ID correcto


    public static final Target MODAL_TITLE = Target.the("Modal Title")
            .located(By.xpath("//div[@class='modal-dialog']//div[@class='modal-header']//h5[@class='modal-title']"));


    public static final Target MODAL_BODY_TEXT = Target.the("Modal Body Text")
            .located(By.xpath("//div[@class='modal-dialog']//div[@class='modal-body']"));

}
