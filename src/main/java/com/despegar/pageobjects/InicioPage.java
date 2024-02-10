package com.despegar.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {

    By btnAlojamiento = By.xpath("//label[contains(text(), 'Alojamientos')]");
    By txtDestino = By.xpath("//*[@id='searchbox-sbox-box-hotels']//input[1]");

    By txtCiudad = By.xpath("//div[contains(text(), 'Cartagena de Indias, Bolívar, Colombia')]");
    By txtFechaEntrada = By.xpath("//*[@id='searchbox-sbox-box-hotels']/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input");
    By txtFechaEntradaDia = By.xpath("//*[@class=\"sbox5-monthgrid-datenumber-number\" and contains(text(), \"12\")]");
    By txtFechaSalida = By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div");
    By txtFechaSalidaDia = By.xpath("//*[@class=\"sbox5-monthgrid-datenumber-number\" and contains(text(), \"15\")]");
    By btnBuscar = By.xpath("//em[contains(text(), 'Buscar')]");
    By btnVerDetalle = By.xpath("//em[contains(text(), 'Ver detalle')]");

    By btnReservar = By.xpath("//em[contains(text(), 'Reservar')]");

    By btnReservarSinDescuento = By.xpath("//em[contains(text(), 'Reservar sin descuento')]");
    By btnSeleccionar = By.xpath("//em[contains(text(), 'Seleccionar')]");

    By txtTarjetaCredito = By.xpath("//h5[contains(text(), ' Tarjeta de crédito ')]");

    By txtNumeroTarjeta = By.id("noPurchaseInputs.paymentData.allPayments[N].cardNumber");

    By txtTitularTarjeta = By.id("noPurchaseInputs.paymentData.allPayments[N].cardHolderName");

    By txtVencimiento = By.id("noPurchaseInputs.paymentData.allPayments[N].expirationDate");

    By txtCodigoSeguridad = By.id("noPurchaseInputs.paymentData.allPayments[N].securityCode");

    By txtCedulaIdentidad = By.id("formData.paymentData.allPayments[N].cardHolderIdentification.number");

    By btnPago = By.xpath("//em[contains(text(), '1 pago')]");

    By btnContinuar = By.id("//em[contains(text(), 'Continuar')]");

    public By getBtnAlojamiento() {
        return btnAlojamiento;
    }

    public By getTxtDestino() {
        return txtDestino;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getTxtFechaEntrada() {
        return txtFechaEntrada;
    }

    public By getTxtFechaEntradaDia() {
        return txtFechaEntradaDia;
    }

    public By getTxtFechaSalida() {
        return txtFechaSalida;
    }

    public By getTxtFechaSalidaDia() {
        return txtFechaSalidaDia;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getBtnVerDetalle() {
        return btnVerDetalle;
    }

    public By getBtnReservar() {
        return btnReservar;
    }

    public By getBtnReservarSinDescuento() {
        return btnReservarSinDescuento;
    }

    public By getBtnSeleccionar() {
        return btnSeleccionar;
    }

    public By getTxtTarjetaCredito() {
        return txtTarjetaCredito;
    }

    public By getTxtNumeroTarjeta() {
        return txtNumeroTarjeta;
    }

    public By getTxtTitularTarjeta() {
        return txtTitularTarjeta;
    }

    public By getTxtVencimiento() {
        return txtVencimiento;
    }

    public By getTxtCodigoSeguridad() {
        return txtCodigoSeguridad;
    }

    public By getTxtCedulaIdentidad() {
        return txtCedulaIdentidad;
    }

    public By getBtnPago() {
        return btnPago;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
