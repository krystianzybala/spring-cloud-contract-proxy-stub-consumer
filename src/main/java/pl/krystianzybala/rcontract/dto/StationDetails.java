package pl.krystianzybala.rcontract.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class StationDetails {
    private int id, stationId;
    private StationParam param;
}
