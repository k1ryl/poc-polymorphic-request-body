package k1ryl.pocpolymorphicrequestbody.rest.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        use = JsonTypeInfo.Id.NAME,
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ARequest.class, name = "A"),
        @JsonSubTypes.Type(value = BRequest.class, name = "B")
})
@Data
public abstract class ParentRequest {
    private Type type;
}
