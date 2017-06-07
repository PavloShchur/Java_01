package com.pavlo.innerClasses;

public class Cat {
	
	public String klikuha;
	public int age;
	
	public Cat(){
		
	}
	
	public Cat(String klikuha, int age) {
		this.klikuha =klikuha;
		this.age = age;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((klikuha == null) ? 0 : klikuha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (klikuha == null) {
			if (other.klikuha != null)
				return false;
		} else if (!klikuha.equals(other.klikuha))
			return false;
		return true;
	}

	public String toString(){
		return "Cat [ name= " + klikuha + " age= " + age + " ]";  
	}

}
