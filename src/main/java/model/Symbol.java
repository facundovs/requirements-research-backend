package model;

import javax.persistence.*;

/**
 * Created by facundov on 18/07/16.
 */
@Entity
@Table(name = "symbol")
public class Symbol {
    private String name;
    private String type;
    private String status;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long symbol_id;
    public String getName() {
        return name;
    }
    public String getStatus() {
        return status;
    }
    public void setSymbol_id(long symbol_id) {
        this.symbol_id = symbol_id;
    }
    public long getSymbol_id() {
        return symbol_id;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", symbol_id=" + symbol_id +
                '}';
    }
    public Symbol(){

    }

    public Symbol(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }
}
