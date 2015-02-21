import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;


public class SudoduBerria {
	public static void main(String[] args) {
	int[][] hasi=sudokuHutsaEgin();	
	int[][] beteta=sAusazBete(hasi);
	inprimatuSudoku(beteta);
	}

private static int[][] sudokuHutsaEgin(){
	int x = 9, y = 9;
	int i, j ;
    int[][] array2D = new int[x][y];
    for (i = 0; i < x; i++)
    {
       for (j = 0; j < y; j++)
        {
            System.out.println();
 
            for ( j = 0; j < y; j++)
            {
                array2D[i][j] = 0 ;
                System.out.print("\t" + array2D[i][j]);}
        }
    }
	return array2D;
}
private static int[][] sAusazBete(int[][] sudokuhutsa){
	int[][] sudokuBetea=sudokuhutsa;
	Random ausazkoZenbaki = new Random();
	int hasX= ausazkoZenbaki.nextInt(9);
	int hasY= ausazkoZenbaki.nextInt(9);
	
	int kont=0;
	while (kont<81)
	{kont++;
	
		
	sudokuBetea[hasX][hasY]=bilatuZenbakia(sudokuBetea,hasX,hasY);
	
	 hasX= ausazkoZenbaki.nextInt(9);
	 hasY= ausazkoZenbaki.nextInt(9);}
	
	return sudokuBetea;
		
}
private static int bilatuZenbakia(int[][] sudokuBetea,int X,int Y) {

int kont=0;
int zenbakia= 1;
while (kont<9){
	kont++;
	if(balioduX(zenbakia, Y, sudokuBetea) && balioduY(zenbakia, X, sudokuBetea)){
	sudokuBetea[X][Y]=zenbakia;	
	}
}
	

return zenbakia;

}
private static boolean balioduY(int zenbakia,int X,int[][]sudokuBetea) {
	boolean b=true;
	for (int i=0;i<9;i++){
	if(sudokuBetea[X][i]==zenbakia)
		b=false;
	}
	return b;
	
	
}
private static boolean balioduX(int zenbakia,int Y,int[][]sudokuBetea) {
	boolean b=true;
	for (int i=0;i<9;i++){
	if(sudokuBetea[i][Y]==zenbakia)
		b=false;
	}
	return b;
	
}
private int[] blokeZerrendaEgin(int[][]sudokuBetea,int [] blokea){
	int[] bZerrenda = new int [9];
	for (int i=1;i<bZerrenda.length;i++){
		bZerrenda[i]=blokeakEgin(sudokuBetea,i);	
	}
	return bZerrenda;
	
}


private static void inprimatuSudoku(int[][]sudokuBetea){
	int x = 9, y = 9;
	int i, j ;
   
    for (i = 0; i < x; i++)
    {
       for (j = 0; j < y; j++)
        {
            System.out.println();
 
            for ( j = 0; j < y; j++)
            {
            
                System.out.print("\t" + sudokuBetea[i][j]);}
        }
    }	
}
}