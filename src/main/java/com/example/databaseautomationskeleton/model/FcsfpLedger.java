package com.example.databaseautomationskeleton.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "fcsfp_ledger", schema = "public", catalog = "fpeperfpgsql")
public class FcsfpLedger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ledger_id")
    private Integer ledgerId;

    @Column(name = "executioninstance_id")
    private Integer executionInstanceId;

    public FcsfpLedger(Object[] o) {
        ledgerId= Integer.valueOf(o[0]+"") ;
        executionInstanceId=Integer.valueOf(o[1]+"") ;
    }

    @Override
    public String toString() {
        return "FCSFPLedger{" +
                "ledgerId=" + ledgerId +
                ", executionInstanceId=" + executionInstanceId +
                '}';
    }
    
}


