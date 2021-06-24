public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

//constructor
    public Database(String contents) {

        String[] rows = contents.split("\n");
        colNames = rows[0].split(",");
        numRows = rows.length - 1;//each element of rows is a row

        data = new String [numRows][]; //cols will be filled
        int count = 0;
        for (int i = 1; i < rows.length; i++){
            data[count++] = rows[i].split(",");//populate values on each line for columns
        }
    }
//getValue method
    public String getValue(String columnName,int row){
        for (int i = 0; i<colNames.length; i++){ //file thru all items on a row to find match
            if  (colNames[i] == columnName) {
                return data [row][i];
            }

        }
        return "";
    }

}


