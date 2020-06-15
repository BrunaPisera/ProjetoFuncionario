public class Principal {
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("Bruna", "Pissara", -10);
        Empregado empregado2 = new Empregado("Matheus", "Pissara", 100);

        System.out.println(empregado1.getName() + " " + empregado1.getSobrenome());
        System.out.println(empregado1.getSalary());

        System.out.println(empregado2.getName() + " " + empregado2.getSobrenome());
        System.out.println(empregado2.getSalary());

        empregado1.setRaseSalary();
        empregado2.setRaseSalary();

        System.out.println(empregado1.getSalary());
        System.out.println(empregado2.getSalary());
    }

}
