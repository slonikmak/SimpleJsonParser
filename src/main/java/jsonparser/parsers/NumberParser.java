package jsonparser.parsers;

import jsonparser.Context;
import jsonparser.abstractClasses.Parser;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

public class NumberParser extends Parser {

    public JsonValue parse(Object object, Context context) {

        if (object instanceof Number){
            JsonObjectBuilder builder = Json.createObjectBuilder();
            return builder.add("val", (Integer) object).build().get("val");
        } else return getNext().parse(object, context);


    }
}
