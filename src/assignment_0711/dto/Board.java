package assignment_0711.dto;

import java.util.Date;
import lombok.Data;

/**
 * CREATE TABLE boards
 * (
 *   id        INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 *   title     VARCHAR(25) NOT NULL,
 *   content   TEXT NOT NULL,
 *   writer    VARCHAR(10) NOT NULL,
 *   createdAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP()
 * );
 */

@Data
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;

    public Board() {

    }

    public Board(String btitle, String bcontent, String bwriter) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
    }
    @Override
    public String toString() {
        return String.format("%-6d\t%-10s\t%-15s\t%-20s", this.bno, this.bwriter, this.bdate, this.btitle);
    }
}
