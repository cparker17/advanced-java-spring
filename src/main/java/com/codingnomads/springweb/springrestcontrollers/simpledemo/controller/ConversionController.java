/* CodingNomads (C)2024 */
package com.codingnomads.springweb.springrestcontrollers.simpledemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    private final String text = "this is the text that this is all based on.";

    @RequestMapping(path = "/binary", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String returnSomeBinary() {
        StringBuilder binary = new StringBuilder();
        char[] chars = text.toCharArray();

        for (char c : chars) {
            binary.append("   ").append(Integer.toBinaryString(c));
        }
        return binary.toString();
    }

    @RequestMapping(path = "/normal", method = RequestMethod.GET)
    public String returnTheString() {
        return text;
    }

    @RequestMapping(path = "/backwards")
    public String returnStringBackwards() {
        StringBuilder binary = new StringBuilder();
        char[] chars = text.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            binary.append("   ").append(Integer.toBinaryString(chars[i]));
        }
        return binary.toString();
    }

}
