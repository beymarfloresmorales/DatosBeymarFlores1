<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8"/>
    
    <xsl:template match="/empresa">
        <html>
            <head>
                <title>Lista de Empleados</title>
            </head>
            <body>
                <h1>Empresas</h1>
                <xsl:for-each select="empleado[not(departamento=preceding::empleado/departamento)]">
                    <h2><xsl:value-of select="departamento"/></h2>
                    <ul>
                        <xsl:for-each select="//empleado[departamento=current()/departamento]">
                            <li>
                                <xsl:value-of select="nombre"/> - Salario: $<xsl:value-of select="salario"/>
                            </li>
                        </xsl:for-each>
                    </ul>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
