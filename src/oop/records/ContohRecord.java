package oop.records;

public record ContohRecord(String... names) {
        public ContohRecord{
                System.out.println("ini kode dari constructor record class.");
        }
}
