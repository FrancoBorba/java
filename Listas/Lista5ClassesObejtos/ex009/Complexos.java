package Listas.Lista5ClassesObejtos.ex009;

public class Complexos {
    public class Complexo {
        private double parteReal;
        private double parteImaginaria;
    
        // Construtor sem argumentos
        public Complexo() {
            this.parteReal = 0.0;
            this.parteImaginaria = 0.0;
        }
    
        // Construtor com argumentos
        public Complexo(double parteReal, double parteImaginaria) {
            this.parteReal = parteReal;
            this.parteImaginaria = parteImaginaria;
        }
    
        // Métodos getters
        public double getParteReal() {
            return parteReal;
        }
    
        public double getParteImaginaria() {
            return parteImaginaria;
        }
    
        // Métodos setters
        public void setParteReal(double parteReal) {
            this.parteReal = parteReal;
        }
    
        public void setParteImaginaria(double parteImaginaria) {
            this.parteImaginaria = parteImaginaria;
        }
    
        // Método para somar dois números complexos
        public Complexo somar(Complexo outroComplexo) {
            double novaParteReal = this.parteReal + outroComplexo.getParteReal();
            double novaParteImaginaria = this.parteImaginaria + outroComplexo.getParteImaginaria();
            return new Complexo(novaParteReal, novaParteImaginaria);
        }
    
        // Método para comparar dois números complexos
        public boolean comparar(Complexo outroComplexo) {
            return this.parteReal == outroComplexo.getParteReal() &&
                   this.parteImaginaria == outroComplexo.getParteImaginaria();
        }
    
        
    }
    
}
