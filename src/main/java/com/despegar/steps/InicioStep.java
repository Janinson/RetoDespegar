package com.despegar.steps;

import com.despegar.pageobjects.InicioPage;
import com.despegar.utils.Datos;
import com.despegar.utils.ElementosNoClickAble;
import com.despegar.utils.EsperaExplicita;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;

public class InicioStep {

    Datos datos = new Datos();

    private static final String HOJA_EXCEL = "Datos";
    private static final String RUTA_EXCEL = "DatosUsuario.xlsx";

    EsperaExplicita esperaExplicita = new EsperaExplicita();

    ElementosNoClickAble elementosNoClickAble = new ElementosNoClickAble();

    @Page
    InicioPage inicioPage;

    @Step
    public void abrirNavegador(){
        WebDriverManager.chromedriver().setup();
        inicioPage.openUrl("https://www.despegar.com.co/");
    }

    @Step
    public void clicEnAjendamiento(){
        inicioPage.getDriver().findElement(inicioPage.getBtnAlojamiento()).click();
    }

    @Step
    public void escribirDestino() throws IOException {
        inicioPage.getDriver().findElement(inicioPage.getTxtDestino()).click();
        esperaExplicita.esperaExplicita(5);
        inicioPage.getDriver().findElement(inicioPage.getTxtCiudad()).click();
    }

    @Step
    public void ingresarFechaEntrada() throws IOException {
        esperaExplicita.esperaExplicita(3);
        inicioPage.getDriver().findElement(inicioPage.getTxtFechaEntrada()).click();
        esperaExplicita.esperaExplicita(3);
        inicioPage.getDriver().findElement(inicioPage.getTxtFechaEntradaDia()).click();
    }

    @Step
    public void ingresarFechaSalida() throws IOException {
        inicioPage.getDriver().findElement(inicioPage.getTxtFechaSalida()).click();
        esperaExplicita.esperaExplicita(3);
        inicioPage.getDriver().findElement(inicioPage.getTxtFechaSalidaDia()).click();
    }

    @Step
    public void clicEnBuscar() throws IOException {
        esperaExplicita.esperaExplicita(15);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnBuscar());
    }

    @Step
    public void clicEnVerDetalle() throws IOException {
        esperaExplicita.esperaExplicita(15);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnVerDetalle());
    }

    @Step
    public void clicEnReserva() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnReservar());
    }

    @Step
    public void clicEnReservarSinDescuento() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnReservarSinDescuento());
    }

    @Step
    public void clicEnSeleccionar() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnSeleccionar());
    }

    @Step
    public void clicTarjetaCredito() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getTxtTarjetaCredito());
    }

    @Step
    public void ingresarNumeroTarjetaCredito() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getTxtNumeroTarjeta());
        inicioPage.getDriver().findElement(inicioPage.getTxtNumeroTarjeta()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,0)
        );
    }

    @Step
    public void ingresarTitularTarjeta() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getTxtTitularTarjeta());
        inicioPage.getDriver().findElement(inicioPage.getTxtTitularTarjeta()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,1)
        );
    }

    @Step
    public void ingresarVencimientoTarjeta() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getTxtVencimiento());
        inicioPage.getDriver().findElement(inicioPage.getTxtVencimiento()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,2)
        );
    }

    @Step
    public void ingresarCodigoSeguridad() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getTxtCodigoSeguridad());
        inicioPage.getDriver().findElement(inicioPage.getTxtCodigoSeguridad()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,3)
        );
    }

    @Step
    public void ingresarCedula() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getTxtCedulaIdentidad());
        inicioPage.getDriver().findElement(inicioPage.getTxtCedulaIdentidad()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,4)
        );
    }

    @Step
    public void clicPago() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnPago());
    }

    @Step
    public void clicContinuar() throws IOException {
        esperaExplicita.esperaExplicita(3);
        elementosNoClickAble.clicEnElementoNoClickAble(inicioPage.getDriver(), inicioPage.getBtnContinuar());
    }

}
