package org.generation.employee.Developer;

//Método calcular salario base heredado
double salarioBaseFer = Fernanda.salarioBase;

//Método calcular salario polimórfico
Fernanda.calcularSalario();

public class Developer {

		public void codear() {
			System.out.println("El programador " + this.getNombreCompleto() + " utiliza " + this.lenguajeProgramacion);
		}

		@Override
		public String toString() {
			return "Developer [Id=" + getId() + ", NombreCompleto=" + getNombreCompleto() + ", Puesto=" + getPuesto() + ", Salario="	+ getSalario() + ", lenguajeProgramacion=" + lenguajeProgramacion + "]";
		}

	}


