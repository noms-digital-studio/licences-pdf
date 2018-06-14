package uk.gov.justice.digital.licences.pdf.data;

import java.util.Map;
import lombok.Value;

@Value
public class PdfRequest {

    private String templateName;

    private Map<String, Object> values;
}
