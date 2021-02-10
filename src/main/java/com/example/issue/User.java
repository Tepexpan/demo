package com.example.issue;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record User(String nombre, String apellidoPaterno, String apellidoMaterno){}
