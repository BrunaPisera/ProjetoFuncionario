public class Principal {
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("Bruna", "Pissara", -10);
        Empregado empregado2 = new Empregado("Matheus", "Pissara", 200);

        //System.out.println(empregado1.getName());
        //System.out.println(empregado1.getSobrenome());
        System.out.println(empregado1.getSalary());

        //System.out.println(empregado2.getName());
        System.out.println(empregado2.getSobrenome());
        System.out.println(empregado2.getSalary());

        empregado1.setRaseSalary();
        empregado2.setRaseSalary();

        System.out.println(empregado1.getSalary());
        System.out.println(empregado2.getSalary());

        System.out.println("teste");
    }

}
