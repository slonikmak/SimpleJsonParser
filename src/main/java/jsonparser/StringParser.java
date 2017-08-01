package jsonparser;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

public class StringParser extends Parser{
    public JsonValue parse(Object object, Context context) {
        if (object instanceof String){
            JsonObjectBuilder builder = Json.createObjectBuilder();
            return builder.add("val", object.toString()).build().get("val");
        } else return next.parse(object, context);
    }
}
