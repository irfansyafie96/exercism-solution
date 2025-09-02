<?php

class AnnalynsInfiltration
{
    public function canFastAttack($is_knight_awake)
    {
        return !$is_knight_awake;
        throw new \BadFunctionCallException("Implement the function");
    }

    public function canSpy(
        $is_knight_awake,
        $is_archer_awake,
        $is_prisoner_awake
    ) {
        return $is_knight_awake || $is_archer_awake || $is_prisoner_awake;
        throw new \BadFunctionCallException("Implement the function");
    }

    public function canSignal(
        $is_archer_awake,
        $is_prisoner_awake
    ) {
        return $is_prisoner_awake && !$is_archer_awake;
        throw new \BadFunctionCallException("Implement the function");
    }

    public function canLiberate(
        $is_knight_awake,
        $is_archer_awake,
        $is_prisoner_awake,
        $is_dog_present
    ) {
        return ($is_dog_present && !$is_archer_awake) || (!$is_dog_present && $is_prisoner_awake && (!$is_knight_awake && !$is_archer_awake));
        throw new \BadFunctionCallException("Implement the function");
    }
}
