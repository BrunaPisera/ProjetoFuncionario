public class Empregado {
    private String name;
    private String sobrenome;
    private double salary;

    public Empregado(String name, String sobrenome, double salary) {
        this.name =  name;
        this.sobrenome = sobrenome;
        if(salary < 0){
            this.salary = 10.00;
        }else{
           this.salary =  salary;
        }
    }

    public String getName(){
        return name;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public double getSalary (){
        return salary;
    }

    public void setRaseSalary (){
        //salary = this.salary;
        this.salary = this.salary*(1.1);
    }
}