package frc.lib.models;

public class FXGains {

        public double P, I, D, F;
        public int slot, iZone;

        public FXGains(int slot, double p, double i, double d, double f, int iZone) {
                this.slot = slot;
                this.P = p;
                this.I = i;
                this.D = d;
                this.F = f;
                this.iZone = iZone;
        }
}