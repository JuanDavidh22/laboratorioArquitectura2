/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author juanc
 */
@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal {

    private static ArrayList<Oferta> ofertas;

    public ServicioOfertaMock() {
        ofertas = new ArrayList<Oferta>();
    }

    @Override
    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    @Override
    public void agregarOferta(Oferta oferta) {
        ofertas.add(oferta);
    }
}
