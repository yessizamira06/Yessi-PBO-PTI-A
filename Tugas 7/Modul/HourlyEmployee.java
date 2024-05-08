import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage; // Upah per jam
    private double hours; // Jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, LocalDate birthDate, double hourlyWage, double hoursWorked) {
        super(name, noKTP, birthDate);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage){
        wage = hourlyWage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hoursWorked){
        hours = hoursWorked;
    }

    public double getHours(){
        return hours;
    }

    public double earnings(){
        if(getHours()<=40)
            return getWage() * getHours();
        else
            return 40 * getWage() + ( getHours()-40) * getWage() * 1.5;
    }

    @Override
    public String toString(){
        return String.format("Hourly employee:\n%s\nhourly wage: %.2f\nhours worked: %.2f", super.toString(), getWage(), getHours());
    }
}
