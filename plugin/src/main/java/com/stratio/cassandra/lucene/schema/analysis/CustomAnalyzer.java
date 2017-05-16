package com.stratio.cassandra.lucene.schema.analysis;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;

/**
 * @author Eduardo Alonso {@literal <eduardoalonso@stratio.com>}
 */
public class CustomAnalyzer extends Analyzer {

    final Tokenizer tokenizer;



    public CustomAnalyzer(Tokenizer tokenizer) {
        this.tokenizer= tokenizer;

    }

    @Override
    protected Analyzer.TokenStreamComponents createComponents(String fieldName) {
        return new TokenStreamComponents(tokenizer);
    }


}