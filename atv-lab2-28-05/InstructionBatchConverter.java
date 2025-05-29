import java.util.ArrayList;
import java.util.List;

public class InstructionBatchConverter {

    public List<Double> executeBatchConversion(List<Instructions> instructions) {
        List<Double> results = new ArrayList<>();

        for (Instructions instr : instructions) {
            Convertible converter = getConverter(instr.getType());
            if (converter != null) {
                results.add(converter.execute(instr.getValue()));
            } else {
                results.add(null); // ou lançar exceção
            }
        }

        return results;
    }

    private Convertible getConverter(String type) {
        switch (type) {
            case "dolar para euro":
                return new DolarToEuro();
            case "euro para real":
                return new EuroToReal();
            case "celsius para faren":
                return new CelciusToFaren();
            case "kilo para stone":
                return new KiloToStone();
            default:
                return null;
        }
    }


}
