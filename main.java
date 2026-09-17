public class main 
{
	public static void main (String[] args) 
	{    
		/////////////////////////
		///  А + В
		
		/// Правки, внесенные Бобом - AA * BB
		
	    Mobile_device md = new Mobile_device("Windows 11", "Aple", "11 inch", "Gray", 11400);
	    System.out.println("Значение полей после инициализации объекта: \n"); 
	    md.printInform();
	    // Присваиваем новые значения полей объекта
	    md.setOperating_system("Linux / " + md.getOperating_system());
	    md.setModel_device("Samsung / " + md.getModel_device());
	    md.setScreen_diagonal("9 inch / " + md.getScreen_diagonal());
	    md.setColor_device("Blue / " + md.getColor_device());
	    md.setClock(md.getClock() + 500);
	    System.out.println("\nЗначение полей после изменения: \n"); 
	    md.printInform();
	}
}
class Mobile_device 
{
		// Поля (приватные, чтобы скрыть данные от внешнего кода)
        private String Operating_system; // Операционная система
        private String Model_device;     // Модель устройства
        private String Screen_diagonal;  // Диагональ экрана
        private String Color_device;     // Цвет устройства
        private int Clock;               // Тактовая частота процессора
        
        // Конструктор для инициализации объекта
        public Mobile_device(String O_S, String M_D, String S_D, String C_D, int Cl) 
        {
           this.Operating_system = O_S;
           this.Model_device = M_D;
           this.Screen_diagonal = S_D;
           this.Color_device = C_D;
           this.Clock = Cl;
        }
        
        // Геттеры (для чтения значений полей)
        public String getOperating_system() { return Operating_system; }
        public String getModel_device()     { return Model_device;     }
        public String getScreen_diagonal()  { return Screen_diagonal;  }
        public String getColor_device()     { return Color_device;     }
        public int getClock()               { return Clock;            }
        
        // Сеттеры (для изменения значений полей)
        public void setOperating_system(String O_S) { if (O_S != null && !O_S.isEmpty()) this.Operating_system = O_S; }
        public void setModel_device(String M_D)     { if (M_D != null && !M_D.isEmpty()) this.Model_device = M_D;     }
        public void setScreen_diagonal(String S_D)  { if (S_D != null && !S_D.isEmpty()) this.Screen_diagonal = S_D;  }
        public void setColor_device(String C_D)     { if (C_D != null && !C_D.isEmpty()) this.Color_device = C_D;     }
        public void setClock(int Cl) { if (Cl != 0) this.Clock = Cl;}
        
        // Метод, выводящий информацию на экран
        public void printInform()
        {
			if (this.Operating_system != null && !this.Operating_system.isEmpty()) 
			   System.out.println("Операционная система - " + this.Operating_system);
			if (this.Model_device != null && !this.Model_device.isEmpty()) 
			   System.out.println("Модель устройства - " + this.Model_device);
			if (this.Screen_diagonal != null && !this.Screen_diagonal.isEmpty()) 
			   System.out.println("Диагональ экрана - " + this.Screen_diagonal);
			if (this.Color_device != null && !this.Color_device.isEmpty()) 
			   System.out.println("Цвет устройства - " + this.Color_device);
			if (this.Clock != 0 ) System.out.println("Модель устройства - " + this.Clock);	
		}       
}
