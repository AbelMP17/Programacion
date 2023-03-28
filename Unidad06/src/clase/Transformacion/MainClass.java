/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.Transformacion;

import java.util.*;
import java.util.function.*;

/**
 *
 * @author usuario
 */
public class MainClass {
    public static void main(String[] args) {
        Function<List<List<String>>,List<String>> f = metalista -> {
            List<String> r = new ArrayList<>();
            metalista.forEach(sublista -> r.addAll(sublista));
            return r;
        };
    }
}
