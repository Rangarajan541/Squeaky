/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squeaky;

/**
 *
 * @author Intel
 */
public class ThreadLong {

    private long bytes = 0;

    void incrementBytes() {
        this.bytes++;
    }

    long getBytes() {
        return this.bytes;
    }
}
