package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class HuggiesTroca extends AppCompatActivity {

    int w, x, y, z;
    String resultadoFinalHuggiesTroca;
    Button ResHuggiesTroca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huggies_troca);

        ResHuggiesTroca = findViewById(R.id.btnResultadoHuggiesTroca);

        ResHuggiesTroca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (HuggiesTroca.this, resultado.class);
                intent.putExtra("chave3", resultadoFinalHuggiesTroca);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.prevencao:
                if (checked)
                    x = 1;
                break;

            case R.id.hidratacao:
                if (checked)
                    x = 2;
                break;

            case R.id.ambos:
                if (checked)
                    x = 3;
                break;

            case R.id.trocaMedia:
                if (checked)
                    y = 1;
                break;

            case R.id.trocaAlta:
                if (checked)
                    y = 2;
                break;

            case R.id.cabeloSim:
                if (checked)
                    z = 1;
                break;

            case R.id.cabeloNao:
                if (checked)
                    z = 2;
                break;

            case R.id.cacheadoSim:
                if (checked)
                    w = 1;
                break;

            case R.id.cacheadoNao:
                if (checked)
                    w = 2;
                break;
        }

        if (x == 1 && y == 1 && z == 1 && w == 1 ) {
            resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray anti frizz";

        } else {

            if (x == 1 && y == 1 && z == 2 && w == 1 ) {
                resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Creme preventivo Huggies normal";

            } else {

                if (x == 1 && y == 2 && z == 1 && w == 1) {
                    resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray anti frizz";

                } else {

                    if (x == 1 && y == 2 && z == 2 && w == 1) {
                        resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Creme preventivo Huggies am??ndoas";

                    } else {

                        if (x == 2 && y == 1 && z == 1 && w == 1) {
                            resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray anti frizz";

                        } else {

                            if (x == 2 && y == 1 && z == 2 && w == 1) {
                                resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Creme preventivo 100 primeiros dias";

                            } else {

                                if (x == 2 && y == 2 && z == 1 && w == 1) {
                                    resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray anti frizz";

                                } else {

                                    if (x == 2 && y == 2 && z == 2 && w == 1 ) {
                                        resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Lo????o hidratante";

                                    } else {

                                        if (x == 3 && y == 1 && z == 1 && w == 1) {
                                            resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray anti frizz";

                                        } else {

                                            if (x == 3 && y == 1 && z == 2 && w == 1) {
                                                resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas Supreme Care";

                                            } else {

                                                if (x == 3 && y == 2 && z == 1 && w == 1) {
                                                    resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray anti frizz";

                                                } else {

                                                    if (x == 3 && y == 2 && z == 2 && w == 1) {
                                                        resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas one & done";

                                                    } else {

                                                        if (x == 1 && y == 1 && z == 1 && w == 2) {
                                                            resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray desembara??ante";

                                                        } else {

                                                            if (x == 1 && y == 1 && z == 2 && w == 2 ) {
                                                                resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas Baby Wipes";

                                                            } else {

                                                                if (x == 1 && y == 2 && z == 1 && w == 2) {
                                                                    resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray desembara??ante";

                                                                } else {

                                                                    if (x == 1 && y == 2 && z == 2 && w == 2) {
                                                                        resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas Max Clean";

                                                                    } else {

                                                                        if (x == 2 && y == 1 && z == 1 && w == 2) {
                                                                            resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray desembara??ante";

                                                                        } else {

                                                                            if (x == 2 && y == 1 && z == 2 && w == 2) {
                                                                                resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas Pure Care";

                                                                            } else {

                                                                                if (x == 2 && y == 2 && z == 1 && w == 2) {
                                                                                    resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray desembara??ante";

                                                                                } else {

                                                                                    if (x == 2 && y == 2 && z == 2 && w == 2) {
                                                                                        resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Lo????o hidratante";

                                                                                    } else {

                                                                                        if (x == 3 && y == 1 && z == 1 && w == 2) {
                                                                                            resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray desembara??ante";

                                                                                        } else {

                                                                                            if (x == 3 && y == 1 && z == 2 && w == 2) {
                                                                                                resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas Supreme Care";

                                                                                            } else {

                                                                                                if (x == 3 && y == 2 && z == 1 && w == 2) {
                                                                                                    resultadoFinalHuggiesTroca = "O produto mais recomendado ?? Spray desembara??ante";

                                                                                                } else {

                                                                                                    if (x == 3 && y == 2 && z == 2 && w == 2) {
                                                                                                        resultadoFinalHuggiesTroca = "O produto mais recomendado ?? toalhas one & done";


                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

