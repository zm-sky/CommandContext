/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.List;

/**
 *
 * @author zippy
 */
public interface CommandContext{
    public void registrarTurno(int turno);
    public void iniciarJuego(String frase);
    public void finalizarJuego(String ganador);
    public void avanzarTurno();
    public void agregarLetraIncorrecta(Character letra);
    public void resetearTimer();
    public void agregarLetraCorrecta(Character letra);
}
