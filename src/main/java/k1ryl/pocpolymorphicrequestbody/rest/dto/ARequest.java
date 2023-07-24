package k1ryl.pocpolymorphicrequestbody.rest.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ARequest extends ParentRequest {

    private String name;
}
