package com.claseJuan.numerologia.service.impl;

import com.claseJuan.numerologia.dto.NameNumerology;
import com.claseJuan.numerologia.service.NumerologyService;
import org.springframework.stereotype.Service;

@Service
public class NumerogyServiceImplementation implements NumerologyService {
    @Override

    public NameNumerology calculate(String name) {
        NameNumerology nm = new NameNumerology();
        nm.setName(name);
        nm.setLifeGoalsNumber(0);
        nm.setVowels("");
        nm.setConsonants("");
        nm.setExternalVibrationNumber(0);
        nm.setInternalVibrationNumber(0);
        for (int i = 0; i < name.length(); i++) {
            String x = String.valueOf(name.charAt(i));

            if (x.equals("a") || x.equals("j") || x.equals("s")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 1);
                if (x.equals("a")) {
                    nm.setVowels(nm.getVowels().concat("a"));
                    nm.setInternalVibrationNumber(nm.getInternalVibrationNumber()+1);
                } else {
                    nm.setConsonants(nm.getConsonants().concat(x));
                    nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+1);
                }
            }

            if (x.equals("b") || x.equals("k") || x.equals("t")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 2);
                nm.setConsonants(nm.getConsonants().concat(x));
                nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+2);
            }

            if (x.equals("c") || x.equals("l") || x.equals("u")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 3);
                if (x.equals("u")) {
                    nm.setVowels(nm.getVowels().concat("u"));
                    nm.setInternalVibrationNumber(nm.getInternalVibrationNumber()+3);
                } else {
                    nm.setConsonants(nm.getConsonants().concat(x));
                    nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+3);
                }
            }
            if (x.equals("d") || x.equals("m") || x.equals("v")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 4);
                nm.setConsonants(nm.getConsonants().concat(x));
                nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+4);
            }
            if (x.equals("e") || x.equals("n") || x.equals("w") || x.equals("ñ")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 5);
                if (x.equals("e")) {
                    nm.setVowels(nm.getVowels().concat("e"));
                    nm.setInternalVibrationNumber(nm.getInternalVibrationNumber()+5);
                } else {
                    nm.setConsonants(nm.getConsonants().concat(x));
                    nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+5);
                }
            }
            if (x.equals("f") || x.equals("o") || x.equals("x")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 6);
                if (x.equals("o")) {
                    nm.setVowels(nm.getVowels().concat("o"));
                    nm.setInternalVibrationNumber(nm.getInternalVibrationNumber()+6);
                } else {
                    nm.setConsonants(nm.getConsonants().concat(x));
                    nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+6);
                }
            }
            if (x.equals("g") || x.equals("p") || x.equals("y")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 7);
                nm.setConsonants(nm.getConsonants().concat(x));
                nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+7);
            }
            if (x.equals("h") || x.equals("q") || x.equals("z")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 8);
                nm.setConsonants(nm.getConsonants().concat(x));
                nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+8);
            }
            if (x.equals("i") || x.equals("r")) {
                nm.setLifeGoalsNumber(nm.getLifeGoalsNumber() + 9);
                if (x.equals("i")) {
                    nm.setVowels(nm.getVowels().concat("i"));
                    nm.setInternalVibrationNumber(nm.getInternalVibrationNumber()+9);
                } else {
                    nm.setConsonants(nm.getConsonants().concat(x));
                    nm.setExternalVibrationNumber(nm.getExternalVibrationNumber()+9);
                }
                }
            }

            if (nm.getLifeGoalsNumber() > 9) {
                Integer convertedNumber = convertToOneDigit(nm.getLifeGoalsNumber());
                nm.setLifeGoalsNumber(convertedNumber);
            }
            if (nm.getInternalVibrationNumber() > 9) {
                Integer convertedNumber = convertToOneDigit(nm.getInternalVibrationNumber());
                nm.setInternalVibrationNumber(convertedNumber);
            }
            if (nm.getExternalVibrationNumber() > 9) {
                Integer convertedNumber = convertToOneDigit(nm.getExternalVibrationNumber());
                nm.setExternalVibrationNumber(convertedNumber);
            }

        return nm;
    }

        //Esta función permite convertir un numero
        public Integer convertToOneDigit (Integer numeroRecibido){
            int suma = 0;
            int residuo;
            while (numeroRecibido > 0) {
                residuo = numeroRecibido % 10;
                suma = suma + residuo;
                numeroRecibido = numeroRecibido / 10;
            }
            if (suma >= 10) {
                suma = convertToOneDigit(suma);
            }
            return suma;
        }
}
