package com.despegar.stepdefinitions;

import com.despegar.steps.InicioStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class InicioStepDefinition {

    @Steps
    InicioStep inicioStep;


    @Given("que estoy en la página principal de Despegar.com")
    public void queEstoyEnLaPáginaPrincipalDeDespegarCom() {
        inicioStep.abrirNavegador();
    }

    @When("realizo una busqueda de servicios con los datos requeridos")
    public void realizoUnaBusquedaDeServiciosConLosDatosRequeridos() {
       inicioStep.clicEnAjendamiento();
    }

    @When("selecciono un resultado de búsqueda según los criterios especificados")
    public void seleccionoUnResultadoDeBúsquedaSegúnLosCriteriosEspecificados() throws IOException {
        inicioStep.escribirDestino();
        inicioStep.ingresarFechaEntrada();
        inicioStep.ingresarFechaSalida();
        inicioStep.clicEnBuscar();
        inicioStep.clicEnVerDetalle();
        inicioStep.clicEnReserva();
        inicioStep.clicEnReservarSinDescuento();
        inicioStep.clicEnSeleccionar();
    }
    @When("diligencio los campos de pago con tarjeta de crédito")
    public void diligencioLosCamposDePagoConTarjetaDeCrédito() throws IOException {
        inicioStep.clicTarjetaCredito();
        inicioStep.ingresarNumeroTarjetaCredito();
        inicioStep.ingresarTitularTarjeta();
        inicioStep.ingresarVencimientoTarjeta();
        inicioStep.ingresarCodigoSeguridad();
        inicioStep.ingresarCedula();
    }

    @Then("se da por finalizada la ejecución del flujo de reserva")
    public void seDaPorFinalizadaLaEjecuciónDelFlujoDeReserva() throws IOException {
        inicioStep.clicPago();
        inicioStep.clicContinuar();
    }

}