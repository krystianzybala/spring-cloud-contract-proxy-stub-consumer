package pl.krystianzybala.rcontract.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class StationParam {
    private String paramName, paramFormula, paramCode;
    private int idParam;
}
