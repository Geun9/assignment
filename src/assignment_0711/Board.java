package assignment_0711;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Data;

@Data
public class Board {
    private static int id = 0;
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;

    {
        id++;
    }

    Board(String btitle, String bcontent, String bwriter) {
        this.bno = id;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = new Date();
    }
    @Override
    public String toString() {
        return String.format("%-6d\t%-10s\t%-15s\t%-20s", this.bno, this.bwriter, getDate(), this.btitle);
    }

    private String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        return simpleDateFormat.format(this.bdate);
    }

}
