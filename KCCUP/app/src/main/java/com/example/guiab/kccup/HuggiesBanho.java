package com.example.guiab.kccup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class HuggiesBanho extends AppCompatActivity {

    int g, h, i;
    String resultadoFinalHuggiesBanho;
    Button ResHuggiesBanho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huggies_banho);

        ResHuggiesBanho = findViewById(R.id.btnResultadoHuggiesBanho);

        ResHuggiesBanho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (HuggiesBanho.this, resultado.class);
                intent.putExtra("chave4", resultadoFinalHuggiesBanho);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.banhoShampoo:
                if (checked)
                   g = 1;
                break;

            case R.id.banhoCondicionador:
                if (checked)
                   g = 2;
                break;

            case R.id.banhoShampooCondicionador:
                if (checked)
                   g = 3;
                break;

            case R.id.banhoSabonete:
                if (checked)
                   g = 4;
                break;

            case R.id.banheiraSim:
                if (checked)
                   h = 1;
                break;

            case R.id.banheiraNao:
                if (checked)
                   h = 2;
                break;

            case R.id.prioridadeAroma:
                if (checked)
                  i  = 1;
                break;

            case R.id.prioridadeSuave:
                if (checked)
                  i  = 2;
                break;

            case R.id.prioridade100:
                if (checked)
                   i = 3;
                break;

            case R.id.prioridadeCacho:
                if (checked)
                   i = 4;
                break;
        }
            if (g == 1 && h == 1 && i == 1) {
                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo Huggies ch?? de camomila";

            } else {

                if (g == 1 && h == 1 && i == 2) {
                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e condicionador 2 em 1 Huggies extra suave";

                } else {

                    if (g == 1 && h == 1 && i == 3) {
                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                    } else {

                        if (g == 1 && h == 1 && i == 4) {
                            resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo Huggies para cabelos cacheados";

                        } else {

                            if (g == 1 && h == 2 && i == 1) {
                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo Huggies ch?? de camomila";

                            } else {

                                if (g == 1 && h == 2 && i == 2) {
                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e condicionador 2 em 1 Huggies extra suave";

                                } else {

                                    if (g == 1 && h == 2 && i == 3) {
                                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                    } else {

                                        if (g == 1 && h == 2 && i == 4) {
                                            resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo Huggies para cabelos cacheados";

                                        } else {

                                            if (g == 2 && h == 1 && i == 1) {
                                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Condicionador Huggies ch?? de camomila";

                                            } else {

                                                if (g == 2 && h == 1 && i == 2) {
                                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Condicionador Huggies extra suave";

                                                } else {

                                                    if (g == 2 && h == 1 && i == 3) {
                                                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                                    } else {

                                                        if (g == 2 && h == 1 && i == 4) {
                                                            resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Condicionador Huggies para cabelos cacheados";

                                                        } else {

                                                            if (g == 2 && h == 2 && i == 1) {
                                                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Condicionador Huggies ch?? de camomila";

                                                            } else {

                                                                if (g == 2 && h == 2 && i == 2) {
                                                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Condicionador Huggies extra suave";

                                                                } else {

                                                                    if (g == 2 && h == 2 && i == 3) {
                                                                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                                                    } else {

                                                                        if (g == 2 && h == 2 && i == 4) {
                                                                            resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Condicionador Huggies para cabelos cacheados";

                                                                        } else {

                                                                            if (g == 3 && h == 1 && i == 1) {
                                                                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e Condicionador Huggies ch?? de camomila";

                                                                            } else {

                                                                                if (g == 3 && h == 1 && i == 2) {
                                                                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e condicionador 2 em 1 Huggies extra suave";

                                                                                } else {

                                                                                    if (g == 3 && h == 1 && i == 3) {
                                                                                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                                                                    } else {

                                                                                        if (g == 3 && h == 1 && i == 4) {
                                                                                            resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e Condicionador Huggies para cabelos cacheados";

                                                                                        } else {

                                                                                            if (g == 3 && h == 2 && i == 1) {
                                                                                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e Condicionador Huggies ch?? de camomila";

                                                                                            } else {

                                                                                                if (g == 3 && h == 2 && i == 2) {
                                                                                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e condicionador 2 em 1 Huggies extra suave";

                                                                                                } else {

                                                                                                    if (g == 3 && h == 2 && i == 3) {
                                                                                                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                                                                                    } else {

                                                                                                        if (g == 3 && h == 2 && i == 4) {
                                                                                                            resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Shampoo e Condicionador Huggies para cabelos cacheados";

                                                                                                        } else {

                                                                                                            if (g == 4 && h == 1 && i == 1) {
                                                                                                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Sabonete l??quido Huggies ch?? de camomila";

                                                                                                            } else {

                                                                                                                if (g == 4 && h == 1 && i == 2) {
                                                                                                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Sabonete l??quido Huggies extra suave";

                                                                                                                } else {

                                                                                                                    if (g == 4 && h == 1 && i == 3) {
                                                                                                                        resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Sabonete l??quido corpo e cabe??a Huggies primeiros 100 dias";

                                                                                                                    } else {

                                                                                                                        if (g == 4 && h == 1 && i == 4) {
                                                                                                                            resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                                                                                                        } else {

                                                                                                                            if (g == 4 && h == 2 && i == 1) {
                                                                                                                                resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Sabonete em barra Huggies ch?? de camomila ou am??ndoas";

                                                                                                                            } else {

                                                                                                                                if (g == 4 && h == 2 && i == 2) {
                                                                                                                                    resultadoFinalHuggiesBanho = "O produto mais recomendado ?? Sabonete em barra Huggies extra suave";

                                                                                                                                } else {

                                                                                                                                    if (g == 4 && h == 2 && i == 3) {
                                                                                                                                        resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";

                                                                                                                                    } else {

                                                                                                                                        if (g == 4 && h == 2 && i == 4) {
                                                                                                                                            resultadoFinalHuggiesBanho = "N??o h?? nenhum produto dispon??vel com as especifica????es selecionadas";
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
                            }
                        }
                    }
                }

    }
    }
    }
    }
