package k1ryl.pocpolymorphicrequestbody.rest.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BRequest extends ParentRequest {

    private Long amount;
}
