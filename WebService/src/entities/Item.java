package entities;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>An Item Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 17-11-2014
 */
public class Item {
    private String Name;
    private String Menge;
    private String GTIN;
    private String Lot;
    private String ExpiryDate;
    private String Serial;
    private String Beschreibung;
    private String Zusatz;
    private String ATC;
    private Company producer;
    private String checkInDate;

    public Item() {}

    public Item(String name, String menge, String GTIN, String lot, String expiryDate, String serial, String beschreibung, String zusatz, String ATC, Company producer, String checkInDate) {
        Name = name;
        Menge = menge;
        this.GTIN = GTIN;
        Lot = lot;
        ExpiryDate = expiryDate;
        Serial = serial;
        Beschreibung = beschreibung;
        Zusatz = zusatz;
        this.ATC = ATC;
        this.producer = producer;
        this.checkInDate = checkInDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMenge() {
        return Menge;
    }

    public void setMenge(String menge) {
        Menge = menge;
    }

    public String getGTIN() {
        return GTIN;
    }

    public void setGTIN(String GTIN) {
        this.GTIN = GTIN;
    }

    public String getLot() {
        return Lot;
    }

    public void setLot(String lot) {
        Lot = lot;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

    public String getZusatz() {
        return Zusatz;
    }

    public void setZusatz(String zusatz) {
        Zusatz = zusatz;
    }

    public String getATC() {
        return ATC;
    }

    public void setATC(String ATC) {
        this.ATC = ATC;
    }

    public Company getProducer() {
        return producer;
    }

    public void setProducer(Company producer) {
        this.producer = producer;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getCheckInDate() {return checkInDate; }

    public void setCheckInDate(String checkIn) {
        checkInDate = checkIn;
    }

    @Override
    public String toString() {
        return  "Name: " + Name + '\n' +
                "Menge: " + Menge + '\n' +
                "GTIN: " + GTIN + '\n' +
                "Lot: " + Lot + '\n' +
                "Serial: " + Serial + '\n' +
                "Beschreibung: " + Beschreibung + '\n' +
                "Zusatz='" + Zusatz + '\n' +
                "ATC: " + ATC + '\n' +
                "Hersteller: " + producer + '\n';
    }
}
