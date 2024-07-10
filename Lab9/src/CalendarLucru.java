class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        zile = new Zi[7];
        zile[0] = new Zi("Luni", true);
        zile[1] = new Zi("Marti", true);
        zile[2] = new Zi("Miercuri", true);
        zile[3] = new Zi("Joi", true);
        zile[4] = new Zi("Vineri", true);
        zile[5] = new Zi("Sambata", false);
        zile[6] = new Zi("Duminica", false);
    }

    public Zi getZi(String numeZi) {
        for (Zi zi : zile) {
            if (zi.getNume().equalsIgnoreCase(numeZi)) {
                return zi;
            }
        }
        return null;
    }
}