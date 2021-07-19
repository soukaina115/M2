import java.util.ArrayList;

public class Empleados {
	
	public static void main(String[] args) {

		protected String empleado;
		protected double salario;
		
		public Empleado() {
			
			empleado = "";
			salario = 0;
		}
		
		public Emplado(String empelado, double salario) {
			
		//Introduzca un valor
		 if (empleadoDisponible().contains(empleado)) {
			 this.empleado = empleado;
		}else {
			this.empleado = "Volunteer";
		}
		 
		 this.salario=calcSalario(empleado, salario);
		 
		}
		
		//Es un arraylsit
		protected ArrayList<String> empleadoDisponible() {
			ArrayList<String> empeladoList = new ArrayList<String>();
			
			empeladoList.add("Manager");
			empeladoList.add("Boss");
			empeladoList.add("Employee");
			empeladoList.add("Volunteer");
			
			return empeladoLit;	
		}
	
		//Este metode calcular el salario final
		Protected double calcSalario(String empelado, double salario) {
			
			switch (empleado) {
			case "Boss":
				return salario+ salario *0.50;
			case "Manager":
			    return salario + salario + salario * 0.10;
			case "Employee":
				return salario - salario * 0.10;
			case "Volunteer":
				return 0.0;
			default:
				return 0.0;
				
			 }
		}
		
		//La zona de getters
		
		public String getEmpleado() {
			 
			return empelado;
		}
		
		public void setEmpleado(String empelado) {
			this.empleado = empleado;
		}
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
	}
}