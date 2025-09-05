<?php

class Size
{
    public $height;
    public $width;
    
    function __construct($height, $width) {
        $this->height = $height;
        $this->width = $width;
    }

    function getHeight() {
        return $this->height;
    }

    function getWidth() {
        return $this->width;
    }
}
