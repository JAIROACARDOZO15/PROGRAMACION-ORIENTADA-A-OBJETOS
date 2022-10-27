package modelo;

public class Telefonía 
{
        private String NumeroCelular;
        private String Operador;
        private Integer CantidadMinutos;
        private Double ValorMinutos;
        private Double CostoTotal;

        public Telefonía(String NumeroCelular, String Operador, Integer CantidadMinutos, Double ValorMinutos) 
        {
                this.NumeroCelular = NumeroCelular;
                this.Operador = Operador;
                this.CantidadMinutos = CantidadMinutos;
                this.ValorMinutos = ValorMinutos;
        }

        public Telefonía() 
        {
                this.NumeroCelular = "";
                this.Operador = "";
                this.CantidadMinutos = 0;
                this.ValorMinutos = 0.0;
        }

        public String getNumeroCelular() 
        {
                return NumeroCelular;
        }

        public String getOperador() 
        {
                return Operador;
        }

        public Integer getCantidadMinutos() 
        {
                return CantidadMinutos;
        }

        public Double getValorMinutos() 
        {
                return ValorMinutos;
        }

        public Double getCostoTotal() 
        {
                return CostoTotal;
        }

        public void setNumeroCelular(String numeroCelular) 
        {
                this.NumeroCelular = numeroCelular;
        }

        public void setOperador(String operador) 
        {
                this.Operador = operador;
        }

        public void setCantidadMinutos(Integer cantidadMinutos) 
        {
                this.CantidadMinutos = cantidadMinutos;
        }

        public void setValorMinutos(Double valorMinuto) 
        {
                this.ValorMinutos = valorMinuto;
        }

        public void calcularCostoTotal() 
        {
                if (Operador.equals("Movilujo")) 
                {
                    CostoTotal = 0.5 * (CantidadMinutos * ValorMinutos);
                } 
                else 
                {
                    CostoTotal = (double) (CantidadMinutos * ValorMinutos);
                }
        }

        public String toString() 
        {
            return "Teléfono celular: " + NumeroCelular + "\nEmpresa operador: " + Operador
                     + "\nMinutos gastados: " + CantidadMinutos + "\nCosto minuto: " + ValorMinutos
                         + "\nCantidad a pagar: " + CostoTotal;

        }
}