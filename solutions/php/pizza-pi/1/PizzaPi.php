<?php

class PizzaPi
{
    public function calculateDoughRequirement($pizza, $person)
    {
        return $pizza * (($person * 20) + 200);
        throw new \BadFunctionCallException("Implement the function");
    }

    public function calculateSauceRequirement($pizza, $sauceCanVolume)
    {
        return $pizza * 125 / $sauceCanVolume;
        throw new \BadFunctionCallException("Implement the function");
    }

    public function calculateCheeseCubeCoverage($sideLength, $thickness, $diameter)
    {
        return intval(($sideLength ** 3) / ($thickness * pi() * $diameter));
        throw new \BadFunctionCallException("Implement the function");
    }

    public function calculateLeftOverSlices($pizza, $numberOfFriend)
    {
        return $pizza * 8 % $numberOfFriend;
        throw new \BadFunctionCallException("Implement the function");
    }
}
