Feature: Buscar en Google

Scenario: Buscar texto

Given me encuentro en la pagina de google

When busco un texto "automation"

Then deberia ver que el titulo contiene el texto buscado "automation"