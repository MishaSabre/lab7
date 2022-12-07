public class Matrix {

    int i; //количество строк(списков)
    int k;  //количество столбцов
    LinkList[] arr;


    Matrix(int i, int k){

        this.i = i;
        this.k = k;
        this.arr = new LinkList[k];

    }

    public void displayMatrix(){

        for (LinkList elem : arr){
            elem.displayList();
        }

    }



}
