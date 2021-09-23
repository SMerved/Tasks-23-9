  class Datamatik{

  public static void main(String [] args) {
  Student[] students=new Student[10];
  students[0]=new Student("Søren1", 25, false,'b') ;
  students[1]=new Student("Søren2", 25, false,'b') ;
  students[2]=new Student("Søren3", 25, false,'b') ;
  students[3]=new Student("Søren4", 25, false,'b') ;
  students[4]=new Student("Søren5", 25, false,'b') ;
  students[5]=new Student("Søren6", 25, false,'b') ;
  students[6]=new Student("Søren7", 25, false,'b') ;
  students[7]=new Student("Søren8", 25, false,'b') ;
  students[8]=new Student("Søren9", 25, false,'b') ;
  students[9]=new Student("Søren10", 25, false,'b') ;
  System.out.println(printName(students,2));
  System.out.println(indexName(students,"Søren5"));
    System.out.println(indexName(students,"Søren1"));
      System.out.println(indexName(students,"Søren8"));
  }
    public static String printName(Student[] students,int index){
    return students[index].name ;
  }
  public static int indexName(Student[] students, String navn){
    int index=0;
    for(int i=0;i<students.length ; i++) {

      if(students[i].name==navn){
        index=i ;
      }
    }
return index ;
  }
  }
