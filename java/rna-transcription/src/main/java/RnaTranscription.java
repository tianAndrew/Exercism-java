class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand.replace("A","U").replace("T","A").replace("C","M").replace("G","C").replace("M","G");
    }

}
