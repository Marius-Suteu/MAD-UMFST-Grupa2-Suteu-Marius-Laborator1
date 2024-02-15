class Masina {
    int viteza;
    double pretRegulat;
    String culoare;

    Masina(int viteza, double pretRegulat, String culoare) {
        this.viteza = viteza;
        this.pretRegulat = pretRegulat;
        this.culoare = culoare;
    }

    double getPretVanzare() {
        return pretRegulat;
    }
}

class Camion extends Masina {
    int greutate;

    Camion(int viteza, double pretRegulat, String culoare, int greutate) {
        super(viteza, pretRegulat, culoare);
        this.greutate = greutate;
    }

    @Override
    double getPretVanzare() {
        if (greutate > 2000) {
            return super.getPretVanzare() * 0.9;
        } else {
            return super.getPretVanzare() * 0.8;
        }
    }
}

class Ford extends Masina {
    int an;
    int discountProducator;

    Ford(int viteza, double pretRegulat, String culoare, int an, int discountProducator) {
        super(viteza, pretRegulat, culoare);
        this.an = an;
        this.discountProducator = discountProducator;
    }

    @Override
    double getPretVanzare() {
        return super.getPretVanzare() - discountProducator;
    }
}

class Sedan extends Masina {
    int lungime;

    Sedan(int viteza, double pretRegulat, String culoare, int lungime) {
        super(viteza, pretRegulat, culoare);
        this.lungime = lungime;
    }

    @Override
    double getPretVanzare() {
        if (lungime > 20) {
            return super.getPretVanzare() * 0.95;
        } else {
            return super.getPretVanzare() * 0.9;
        }
    }
}

class MagazinAuto {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Rosu", 25);
        Ford ford1 = new Ford(130, 25000, "Albastru", 2019, 500);
        Ford ford2 = new Ford(140, 28000, "Negru", 2020, 600);
        Masina masina = new Masina(110, 15000, "Verde");

        System.out.println("Pretul de vanzare al Sedanului: $" + sedan.getPretVanzare());
        System.out.println("Pretul de vanzare al lui Ford 1: $" + ford1.getPretVanzare());
        System.out.println("Pretul de vanzare al lui Ford 2: $" + ford2.getPretVanzare());
        System.out.println("Pretul de vanzare al masinii: $" + masina.getPretVanzare());
    }
}

